package com.topjava.webapp.storage;

import com.topjava.webapp.model.Resume;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class ObjectStreamPathStorage extends AbstractStorage<Path>{
    private Path directory;

    public ObjectStreamPathStorage(String dir) {
        Objects.requireNonNull(dir, "Directory must be not null");
        this.directory = Paths.get(dir);
        if (!Files.isDirectory(directory) || !Files.isWritable(directory)) {
            throw new IllegalArgumentException(directory + "It's not directory or it's not writable");
        }
    }


    @Override
    protected Path getSearchKey(String uuid) {
        return null;
    }

    @Override
    protected void doUpdate(Resume r, Path path) {

    }

    @Override
    protected boolean isExist(Path path) {
        return false;
    }

    @Override
    protected void doSave(Resume r, Path path) {
        try {
            Files.createFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Resume doGet(Path path) {
        return null;
    }

    @Override
    protected void doDelete(Path path) {
        try {
            Files.delete(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected List<Resume> doCopyAll() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }
}
