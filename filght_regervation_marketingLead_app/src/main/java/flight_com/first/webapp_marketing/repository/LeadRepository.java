package flight_com.first.webapp_marketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import flight_com.first.webapp_marketing.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Integer> {

}
