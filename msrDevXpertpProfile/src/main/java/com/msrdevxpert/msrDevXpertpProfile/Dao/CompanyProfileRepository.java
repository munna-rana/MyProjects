package com.msrdevxpert.msrDevXpertpProfile.Dao;



import com.msrdevxpert.msrDevXpertpProfile.Entity.CompanyProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyProfileRepository extends JpaRepository<CompanyProfile, Long> {
}

