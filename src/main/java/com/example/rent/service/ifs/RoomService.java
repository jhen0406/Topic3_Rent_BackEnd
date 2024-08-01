package com.example.rent.service.ifs;

import com.example.rent.vo.BasicRes;
import com.example.rent.vo.CreateRoomAndphotoReq;
import com.example.rent.vo.CreateRoomReq;
import com.example.rent.vo.DeleteRoomReq;
import com.example.rent.vo.RoomSearchReq;
import com.example.rent.vo.RoomSearchRes;
import com.example.rent.vo.UpdateRoomReq;

public interface RoomService {

	
	public BasicRes creatRoom(CreateRoomReq req);
	
	public BasicRes updateRoom(UpdateRoomReq req);
	
	public RoomSearchRes roomSearch(RoomSearchReq req);
	
	public BasicRes deleteRoom(DeleteRoomReq req);
	
	public BasicRes insertPhoto(String address,byte[] photo);
	
	public BasicRes creatRoomAndInsertPhoto(CreateRoomReq req,byte[] photo);

	public BasicRes creatRoomAndphoto(CreateRoomAndphotoReq req);

}
