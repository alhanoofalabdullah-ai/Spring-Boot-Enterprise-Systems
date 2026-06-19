package com.alhanoof.eam.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/assets")
public class AssetController {

    @GetMapping
    public String getAssets() {
        return "Assets Retrieved Successfully";
    }

    @PostMapping
    public String createAsset() {
        return "Asset Created Successfully";
    }

    @PutMapping("/{id}")
    public String updateAsset(
            @PathVariable Long id
    ) {
        return "Asset Updated Successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteAsset(
            @PathVariable Long id
    ) {
        return "Asset Deleted Successfully";
    }
}
