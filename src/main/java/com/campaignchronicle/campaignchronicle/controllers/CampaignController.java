package com.campaignchronicle.campaignchronicle.controllers;

import com.campaignchronicle.campaignchronicle.entities.Campaign;
import com.campaignchronicle.campaignchronicle.services.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/campaign")
public class CampaignController {

    @Autowired
    CampaignService campaignService;

    @PostMapping("/create")
    public void createCampaign(@RequestBody Campaign campaign) {
        campaignService.createNewCampaign(campaign);
    }

    @PutMapping("/update")
    public void updateCampaign(@RequestBody Campaign campaign) {
        campaignService.updateCampaign(campaign);
    }
}
