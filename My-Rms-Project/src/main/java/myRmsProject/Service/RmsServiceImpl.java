package myRmsProject.Service;
import myRmsProject.Dto.TableBookingDto;
import myRmsProject.Entity.TableBookingEntity;
import myRmsProject.Repository.TableBookingRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class RmsServiceImpl implements RmsService{

    private TableBookingRepo tableBookingRepo;

    public RmsServiceImpl(TableBookingRepo tableBookingRepo){
        this.tableBookingRepo = tableBookingRepo;
    }


    @Override
    public TableBookingDto TableInfo(TableBookingDto tableDto){
        TableBookingEntity entity = new TableBookingEntity();

        BeanUtils.copyProperties(tableDto, entity);
        TableBookingEntity savedEntity = tableBookingRepo.save(entity);

        BeanUtils.copyProperties(savedEntity, tableDto);

        return tableDto;
    }
}
