package com.service;
import com.model.HelperBean;
import org.springframework.stereotype.Service;

@Service
public class HelperService {
    public double calculateTotalCost(HelperBean helpeBean){
        String type=helpeBean.getServiceType();
        int x;
        switch(type){
            case "ACService":helpeBean.setServiceCostPerHour(400f);
                x=(helpeBean.getNoOfHours());
                return 400.0*x;
            
            case "WashingMachineService":helpeBean.setServiceCostPerHour(500f);
                x=(helpeBean.getNoOfHours());
                return 500.0*x;
                
            case "RefrigeratorService":helpeBean.setServiceCostPerHour(300f);
                x=(helpeBean.getNoOfHours());
                return 300.0*x;
        }
        return 0.0;
    }	
	
	

}
