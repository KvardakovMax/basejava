package com.topjava.webapp.storage;

import com.topjava.webapp.model.Resume;

import java.util.ArrayList;
import java.util.List;

public class ListStorage extends AbstractStorage {
    private List<Resume> arrayList = new ArrayList<>();

    @Override
    public int size() {
        return arrayList.size();
    }

    @Override
    protected Integer getSearchKey(String uuid) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getUuid().equals(uuid)) {
                return i;
            }
        }
        return null;
    }

    @Override
    protected boolean isExist(Object searchKey) {
        return searchKey != null;
    }

    @Override
    protected void doUpdate(Resume r, Object searchKey) {
        arrayList.set((Integer) searchKey, r);
    }

    @Override
    protected void doSave(Resume r, Object searchKey) {
        arrayList.add(r);
    }

    @Override
    protected void doDelete(Object searchKey) {
        arrayList.remove(((Integer) searchKey).intValue());
    }

    @Override
    protected Resume doGet(Object searchKey) {
        return arrayList.get((Integer) searchKey);
    }

    @Override
    public void clear() {
        arrayList.clear();
    }

    @Override
    public List<Resume> doGetAll() {
        return new ArrayList<>(arrayList);
    }
}
