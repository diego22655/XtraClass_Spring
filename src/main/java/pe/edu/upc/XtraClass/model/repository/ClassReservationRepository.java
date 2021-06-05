package pe.edu.upc.XtraClass.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.XtraClass.model.entity.ClassificationConsulting;

@Repository
public interface ClassReservationRepository extends JpaRepository <ClassificationConsulting, Integer>{

}
