package smok.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import smok.springmvc.dao.ILoveDao;
import smok.springmvc.model.tmodel.LovePicture;
import smok.springmvc.service.ILoveService;

public class LoveService implements ILoveService {

	@Autowired
	private ILoveDao loveDao;

	private static final int pageSize = 5;

	@Override
	public List<LovePicture> getPictures(int page) throws Exception {
		int offset = (page - 1) * pageSize;

		return loveDao.getPictures(offset, pageSize);
	}

}
