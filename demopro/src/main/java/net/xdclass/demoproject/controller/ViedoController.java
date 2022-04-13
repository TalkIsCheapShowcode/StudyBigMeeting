package net.xdclass.demoproject.controller;

import net.xdclass.demoproject.domain.Video;
import net.xdclass.demoproject.service.VideoService;
import net.xdclass.demoproject.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 *
 *
 **/


@RestController
@RequestMapping("/api/v1/video")
public class ViedoController {

    @Autowired
    private VideoService videoService;

//    @RequestMapping(value = "list",method = RequestMethod.GET)
    @GetMapping("list")
    public Object List(){
        List<Video> list = videoService.listVideo();
        return JsonData.buildSuccess(list);
    }
}
