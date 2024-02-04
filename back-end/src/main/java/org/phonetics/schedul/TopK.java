package org.phonetics.schedul;

import org.phonetics.entity.video.Video;
import org.phonetics.entity.vo.HotVideo;

import java.util.*;

/**
*
 * @description:
 * @Author: zzz
 * @CreateTime: 2023-11-04 17:42

*/
public class TopK {

    private int k = 0;

    private Queue<HotVideo> queue;

    public TopK(int k,Queue<HotVideo> queue){
        this.k = k;
        this.queue = queue;
    }

    public void add(HotVideo hotVideo) {
        if (queue.size() < k) {
            queue.add(hotVideo);
        } else if (queue.peek().getHot() < hotVideo.getHot()){
            queue.poll();
            queue.add(hotVideo);
        }

        return;
    }


    public List<HotVideo> get(){
        final ArrayList<HotVideo> list = new ArrayList<>(queue.size());
        while (!queue.isEmpty()) {
            list.add(queue.poll());
        }
        Collections.reverse(list);
        return list;
    }


}
