package org.selflearning.msa.dao;

import java.util.List;

import org.selflearning.msa.dto.OrderDTO;
import org.selflearning.msa.dto.ResultDTO;

public interface OrderDao {

	public List<OrderDTO> getOrderByUserid(String userId);
}
