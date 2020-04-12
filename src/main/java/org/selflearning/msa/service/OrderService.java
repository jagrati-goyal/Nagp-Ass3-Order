package org.selflearning.msa.service;

import java.util.List;

import org.selflearning.msa.dto.OrderDTO;
import org.selflearning.msa.dto.ResultDTO;

public interface OrderService {
	
	public List<OrderDTO> getOrderbyUserId(String userId);
}
