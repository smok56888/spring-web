package smok.springmvc.dao;

import java.util.List;

import smok.springmvc.model.tmodel.LovePicture;

public interface ILoveDao {
	
	public List<LovePicture> getPictures(int offset, int count) throws Exception;

}
