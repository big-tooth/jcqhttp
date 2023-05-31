package com.drophair.jcqhttp.service;

import com.drophair.jcqhttp.dao.Bot;

public interface IBotServicce {

    public String get_login_info();

    public void set_qq_profile(Bot bot);

    public String _get_model_show(Bot bot);

    public String get_online_clients(Bot bot);
}
