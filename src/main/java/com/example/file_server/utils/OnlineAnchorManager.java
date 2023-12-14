package com.example.file_server.utils;

import com.example.file_server.entity.Anchor;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

public class OnlineAnchorManager {
    private static final ConcurrentHashMap<String, Anchor> onlineAnchors = new ConcurrentHashMap<>();

    public static void put(Anchor anchor) {
        onlineAnchors.put(anchor.getAnchorUuid(), anchor);
    }

    public static void remove(Anchor anchor) {
        onlineAnchors.remove(anchor.getAnchorUuid());
    }

    public static Collection<Anchor> values() {
        return onlineAnchors.values();
    }

    public static int size() {
        return onlineAnchors.size();
    }

    public static boolean isOnline(Anchor anchor) {
        return onlineAnchors.containsKey(anchor.getAnchorUuid());
    }

    public static boolean isOnline(String uuid) {
        return onlineAnchors.containsKey(uuid);
    }
}
