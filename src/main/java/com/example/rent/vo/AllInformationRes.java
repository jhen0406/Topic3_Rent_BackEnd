package com.example.rent.vo;

import java.util.List;

import com.example.rent.entity.Bill;
import com.example.rent.entity.Contract;
import com.example.rent.entity.Register;
import com.example.rent.entity.Room;

public class AllInformationRes extends BasicRes {

	private List<Register> registerList;

	private List<Room> roomList;

	private List<Contract> contractList;

	private List<Bill> billList;

	public AllInformationRes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AllInformationRes(int code, String message) {
		super(code, message);
		// TODO Auto-generated constructor stub
	}

	public AllInformationRes(int code, String message,List<Register> registerList, List<Room> roomList, List<Contract> contractList,
			List<Bill> billList) {
		super(code, message);
		this.registerList = registerList;
		this.roomList = roomList;
		this.contractList = contractList;
		this.billList = billList;
	}

	public List<Register> getRegisterList() {
		return registerList;
	}

	public void setRegisterList(List<Register> registerList) {
		this.registerList = registerList;
	}

	public List<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}

	public List<Contract> getContractList() {
		return contractList;
	}

	public void setContractList(List<Contract> contractList) {
		this.contractList = contractList;
	}

	public List<Bill> getBillList() {
		return billList;
	}

	public void setBillList(List<Bill> billList) {
		this.billList = billList;
	}

}
