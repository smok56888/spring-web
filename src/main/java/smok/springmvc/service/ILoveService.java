package smok.springmvc.service;

import java.util.List;

import smok.springmvc.model.tmodel.LovePicture;

public interface ILoveService {
	
	public List<LovePicture> getPictures(int page) throws Exception;

}
