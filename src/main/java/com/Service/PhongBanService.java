package com.Service;

import com.Repository.*;
import java.util.*;
import com.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhongBanService {
    @Autowired
    private PhongBanRepo phongBanRepo;

    public List<PhongBan> layTatCaPhongBan() {
        return phongBanRepo.findAll();
    }
}
