package com.topjava.webapp.storage;

import com.topjava.webapp.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    private Resume[] storage = new Resume[10_000];
    private int size;

    public int getIndex(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                return i;
            }
        }
        return size + 1;
    }

    public void save(Resume resume) {
        if (size < storage.length) {
            if (getIndex(resume.getUuid()) == size + 1) {
                storage[size] = resume;
                size++;
            } else {
                System.out.println("Such resume already exists");
            }
        } else {
            System.out.println("Storage is full");
        }
    }

    public void update(Resume resume) {
        if (getIndex(resume.getUuid()) != size + 1) {
            storage[getIndex(resume.getUuid())] = resume;
        } else {
            System.out.println("Such resume not found");
        }
    }

    public Resume get(String uuid) {
        if (getIndex(uuid) == size + 1) {
            System.out.println("Resume not found");
            return null;
        }
        return storage[getIndex(uuid)];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            storage[i] = null;
        }
        size = 0;
    }

    public void delete(String uuid) {
        if (getIndex(uuid) == size + 1) {
            System.out.println("Resume not found");
        } else {
            storage[getIndex(uuid)] = storage[size - 1];
            storage[size - 1] = null;
            size--;
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    public Resume[] getAll() {
        return Arrays.copyOf(storage, size);
    }

    public int size() {
        return size;
    }
}
