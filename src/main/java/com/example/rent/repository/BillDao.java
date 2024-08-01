package com.example.rent.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.rent.entity.Bill;
import com.example.rent.entity.Contract;

@Repository
public interface BillDao extends JpaRepository<Bill,Integer> {

	public boolean existsByPeriodStart(LocalDate periodStart); //開始時間
	
//	public boolean existsByPeriodStart(LocalDate periodStart); //開始時間
	
	public boolean existsByAddress(String address); //地址
	
	public boolean existsByTenantIdentity(String tenantIdentity); //房客身分證
	
	public List<Bill> findByAddressEquals(String address);
	
	public List<Bill> findByTenantIdentityEquals(String tenantIdentity);
	
	public List<Bill> findByAddressEqualsAndTenantIdentityEqualsAndPeriodStartGreaterThanEqualAndPeriodEndLessThanEqual(String address,String tenantIdentity,LocalDate periodStart,LocalDate periodEnd);

	public List<Bill> findByAddressContainingAndTenantNameContainingAndRoomIdContainingAndStartDateGreaterThanEqualAndEndDateLessThanEqualAndPeriodStartGreaterThanEqualAndPeriodEndLessThanEqual(String address,String tenantName,String roomId,LocalDate startDate,LocalDate endDate,LocalDate periodStart,LocalDate periodEnd);
//	@Modifying
//	@Query("DELETE FROM Bill as b WHERE b.address = :address AND b.tenantIdentity = :tenantIdentity AND b.periodStart >= :periodStart AND b.periodEnd <= :periodEnd")
//	public void deleteByAddressAndTenantIdentityAndPeriodStartGreaterThanEqualAndPeriodEndLessThanEqual(
//			@Param("address")String address,@Param("tenantIdentity") String tenantIdentity,@Param("periodStart") LocalDate periodStart,@Param("periodEnd") LocalDate periodEnd);

	public boolean existsByAddressAndPeriodStartAndPeriodEnd(String address, LocalDate periodStart, LocalDate periodEnd);
	
	public boolean existsByAddressAndAndPeriodEnd(String address, LocalDate periodEnd);

	public List<Bill> findByAddressIn(Set<String> addresses);
}

