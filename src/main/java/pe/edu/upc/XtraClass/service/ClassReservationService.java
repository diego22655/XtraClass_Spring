package pe.edu.upc.XtraClass.service;

import java.util.Date;
import java.util.List;

import pe.edu.upc.XtraClass.model.entity.ClassReservation;

public interface ClassReservationService extends CrudService<ClassReservation,Integer>{
List<ClassReservation>findByStarTime(String StarTime);

static List<ClassReservation> findByStarTime(Date starTime, String string) {
	// TODO Auto-generated method stub
	return null;
}

}
