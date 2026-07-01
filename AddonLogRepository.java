package com.example.addonmerger.repository;

import com.example.addonmerger.model.AddonLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddonLogRepository extends JpaRepository<AddonLog, Long> {
    // Database Query များကို ဤနေရာတွင် လိုအပ်သလို ထပ်တိုးနိုင်ပါသည်
}
