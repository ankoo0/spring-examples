package springApproach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VideoService {

    private DenoiserService denoiserService;

    @Autowired
    public VideoService(DenoiserService denoiserService) {
        this.denoiserService = denoiserService;
    }
}
