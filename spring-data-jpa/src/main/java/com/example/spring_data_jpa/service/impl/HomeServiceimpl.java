package com.example.spring_data_jpa.service.impl;

import com.example.spring_data_jpa.dto.DTOHome;
import com.example.spring_data_jpa.dto.DTORoom;
import com.example.spring_data_jpa.entity.Home;
import com.example.spring_data_jpa.entity.Room;
import com.example.spring_data_jpa.repository.HomeRepository;
import com.example.spring_data_jpa.service.IHomeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HomeServiceimpl implements IHomeService {
    @Autowired
    private HomeRepository homeRepository;

    @Override
    public DTOHome findHomeByid(Long id) {
        DTOHome dtoHome = new DTOHome();
        Optional<Home> optional= homeRepository.findById(id);
        if (optional.isEmpty()){
            return null;
        }
        Home dbhome = optional.get();
        List<Room> dbRooms = optional.get().getRoom();

        BeanUtils.copyProperties(dbhome,dtoHome);
        if (dbRooms!=null &&  !dbRooms.isEmpty()){
            for (Room room : dbRooms) {
                DTORoom dtoRoom = new DTORoom();
                BeanUtils.copyProperties(room,dtoRoom);
                dtoHome.getRooms().add(dtoRoom);
            }
        }
        return dtoHome;

    }
}
