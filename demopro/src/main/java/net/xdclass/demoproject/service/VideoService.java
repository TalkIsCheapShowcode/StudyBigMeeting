package net.xdclass.demoproject.service;

import net.xdclass.demoproject.domain.Video;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VideoService {
    List<Video> listVideo();
}
