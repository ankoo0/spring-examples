package springApproach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "fileService")
public class FileService {

    private ImageService imageService;
    private VideoService videoService;

    @Autowired
    public FileService(ImageService imageService, VideoService videoService) {
        this.imageService = imageService;
        this.videoService = videoService;
    }
}
