package myRmsProject.Controller;

import myRmsProject.Dto.TableBookingDto;
import myRmsProject.Repository.TableBookingRepo;
import myRmsProject.Service.RmsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class RmsController {

    private TableBookingRepo tableBookingRepo;
    private RmsService rmsService;

    public RmsController(TableBookingRepo tableBookingRepo, RmsService rmsService){
        this.tableBookingRepo = tableBookingRepo;
        this.rmsService = rmsService;
    }

    @PostMapping("save/table")
    public String TableInfo(@RequestBody TableBookingDto TableDto){
        rmsService.TableInfo(TableDto);
        return "Data Saved! ";
    }

    @DeleteMapping("delete/table/{id}")
    public String DeleteTable(@PathVariable Long id){
        tableBookingRepo.deleteById(id);
        return "Deleted";
    }
}
