package com.eshare.watchservice.chapter1;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * WatchServiceExample2
 *
 * @author liangyh
 * @date 2018/8/6
 */
public class WatchServiceExample2 {

    public static void main(String[] args) throws IOException {

        Path curPath = Paths.get(".");
        WatchService watchService = curPath.getFileSystem().newWatchService();
        //遍历并注册目录
        walkAndRegisterDirectories(curPath, watchService);
        try {
            //监听目录变化
            while (true) {
                WatchKey watchKey = watchService.take();
                for (WatchEvent event : watchKey.pollEvents()) {
                    handleEvent(event);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static void handleEvent(WatchEvent event) {
        if (StandardWatchEventKinds.ENTRY_MODIFY.equals(event.kind())) {
            System.out.println("文件被修改啦！！！");
        }
    }

    private static void walkAndRegisterDirectories(Path path, WatchService watchService) throws IOException {
        Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                registerDirectory(dir, watchService);
                return FileVisitResult.CONTINUE;
            }
        });
    }

    private static void registerDirectory(Path dir, WatchService watchService) throws IOException {
        WatchKey key = dir.register(watchService, StandardWatchEventKinds.ENTRY_CREATE
                , StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
    }
}