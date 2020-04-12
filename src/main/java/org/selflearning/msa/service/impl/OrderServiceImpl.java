package org.selflearning.msa.service.impl;

import java.util.List;

import org.selflearning.msa.dao.OrderDao;
import org.selflearning.msa.dto.OrderDTO;
import org.selflearning.msa.dto.ResultDTO;
import org.selflearning.msa.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderDao orderDao;

	public List<OrderDTO> getOrderbyUserId(String userId) {
		return orderDao.getOrderByUserid(userId);
	}
}
