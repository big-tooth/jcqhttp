package com.drophair.jcqhttp.service;

import com.drophair.jcqhttp.dao.Friend;
import com.drophair.jcqhttp.dao.Msg;

public interface IFriendService {

    public String get_stranger_info(Friend friend);

    public String get_frient_list();

    public String get_unidirectional_friend_list();

    public void delete_friend(Friend friend);

    public void delete_unidirectional_friend(Friend friend);

    public String send_private_msg(Msg message);

    public String send_group_msg(Msg message);
}
