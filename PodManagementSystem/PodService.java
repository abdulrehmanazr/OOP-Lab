package service;

import model.Pod;

import java.util.ArrayList;
import java.util.List;

public class PodService {
    private List<Pod> pods = new ArrayList<>();

    public void addPod(String podId, int capacity) {
        pods.add(new Pod(podId, capacity));
    }

    public Pod getPodById(String podId) {
        for (int i = 0; i < pods.size(); i++) {
            Pod p = pods.get(i);
            if (p.getPodId().equalsIgnoreCase(podId)) {
                return p;
            }
        }
        return null;
    }

    public List<Pod> getAllPods() {
        return pods;
    }
}
