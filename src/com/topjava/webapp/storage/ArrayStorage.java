package com.topjava.webapp.storage;

import com.topjava.webapp.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    private Resume[] storage = new Resume[10000];
    private int size;

    public Resume searchResumes(String uuid) {
        Resume searchedResume = null;
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                searchedResume = storage[i];
            }
        }
        if (searchedResume == null) {
            System.out.println("Such uuid not exists");
        }
        return searchedResume;
    }

    public Resume searchResumes(Resume resume) {
        Resume searchedResume = null;
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(resume.getUuid())) {
                searchedResume = storage[i];
            }
        }
        return searchedResume;
    }

    public int searchResumeIndex(Resume resume) {
        int resumeIndex = size + 1;
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(resume.getUuid())) {
                resumeIndex = i;
            }
        }
        return resumeIndex;
    }

    public void save(Resume resume) {
        if (size < storage.length) {
            if (searchResumes(resume) == null) {
                storage[size] = resume;
                size++;
            } else {
                System.out.println("Such resume already exists");
            }
        } else {
            System.out.println("Array is full");
        }
    }

    public void update(Resume resume) {
        if (searchResumeIndex(resume) != size + 1) {
            storage[searchResumeIndex(resume)] = resume;
        } else {
            System.out.println("Such resume not exists");
        }
    }

    public Resume get(String uuid) {
        return searchResumes(uuid);
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            storage[i] = null;
        }
        size = 0;
    }

    public void delete(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                System.arraycopy(storage, i + 1, storage, i, size - i);
                size--;
                break;
            } else {
                System.out.println("Resume not found");
                break;
            }
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
