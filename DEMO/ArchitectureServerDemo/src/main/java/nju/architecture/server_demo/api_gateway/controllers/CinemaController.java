package nju.architecture.server_demo.api_gateway.controllers;

import nju.architecture.server_demo.api_gateway.RPCProxy;
import nju.architecture.server_demo.database_cluster.entity.Cinema;
import nju.architecture.server_demo.database_cluster.entity.Movie;
import nju.architecture.server_demo.register_cluster.serviceinfo.ServiceInfo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cinema")
public class CinemaController {

    private RPCProxy proxy = new RPCProxy();

    @PostMapping(value = "/addCinema")
    public long addCinema(@RequestParam Cinema cinema) {
        System.out.println("addCinema Controller ran");
        return 1232324345L;
    }

    @PutMapping(value = "/editCinemaInfo")
    public boolean editCinemaInfo(@RequestParam Cinema cinema) {
        System.out.println("editCinemaInfo Controller ran");
        return true;
    }

    @GetMapping(value = "/getAllCinemas")
    public List<Cinema> getAllCinemas() {
        ServiceInfo serviceInfo = proxy.getServicePath("cinema");
        proxy.callService(serviceInfo.getPath());
        System.out.println("getAllCinemas Controller ran");
        return new ArrayList<>();
    }

    @GetMapping(value = "/getCinemaList")
    public List<Cinema> getCinemaList(@RequestParam Movie movie) {
        System.out.println("getCinemaList Controller ran");
        return new ArrayList<>();
    }
}
