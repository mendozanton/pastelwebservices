INSERT INTO pastel.usuario_sexo (nom_sex) VALUES 
('Masculino'),('Femenino'),('No prefiero no decirlo'),('Selecione su genero');
INSERT INTO pastel.estado (nom_est) VALUES 
('Habilitado'),('Deshabilitado'),('Recien enviado'),('Enviado'),('Sin stock'),('Cancelado');
INSERT INTO pastel.direccion_distrito (nom_dis) VALUES 
('Cercado de lima'),('Jesus Maria'),('Lince'),('Breña');
INSERT INTO pastel.pedido_prioridad (nom_ped_prid) VALUES 
('Alta'),('Media'),('Baja');
INSERT INTO pastel.perfil (nom_per) VALUES ('usuario del sistema');
INSERT INTO pastel.rol (nom_rol) VALUES 
('Administrador'),('Repartidor'),('Cajero'),('Cliente');
INSERT INTO pastel.perfil_roles (perfiles_id_per,roles_id_rol) VALUES 
(1,1),(1,2),(1,4);
INSERT INTO pastel.direccion (aven_dir,calle_dir,cod_pos_dir,dep_dir,lot_dir,manz_dir,ref_dir,sect_dir,urb_dir,id_dis) VALUES 
('av. los girasoles','call falsa',8419,NULL,NULL,NULL,'al costado del colegio ''cesar vallejo''','40',NULL,1)
,('av. los caceres',NULL,4989,'el bienestar',NULL,NULL,'junto al hotel ',NULL,'asfasfg',2)
,('av. bla bla bla','calle falsa',22222,NULL,'0','z','esta es la referencia','este es el sector','qwerty',1);
INSERT INTO pastel.usuario (ape_usu,eda_usu,ema_usu,nom_usu,pass_usu,tel_usu,id_dir,id_est,id_per,id_rol,id_sex) VALUES 
('Mendoza',21,'abrmendoza32@gmail.com','Abraham','1234',924659960,3,1,1,1,1);
INSERT INTO pastel.mensaje (men_mens) VALUES 
('Fallo validacion'),('Usuario encontrado');
INSERT INTO pastel.error (cam_err,men_err,id_mens) VALUES 
('Email','Email de usuario no encontrado',1),('Pasword','Contraseña de usuario no encontrado',1);
