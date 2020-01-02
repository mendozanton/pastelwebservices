use pastel;

INSERT INTO pastel.usuario_sexo (nom_sex) VALUES 
('Seleccione su sexo'),('Masculino'),
('Femenino');


INSERT INTO pastel.estado (nom_est) VALUES 
('Habilitado'),('Deshabilitado'),('Recien enviado'),
('Enviado'),('Sin stock'),('Cancelado'),
('Disponible');

INSERT INTO pastel.direccion_distrito (nom_dis) VALUES 
('Cercado de lima'),('Jesus Maria'),('Lince'),('San borja');

INSERT INTO pastel.pedido_prioridad (nom_ped_prid) VALUES 
('Alta'),('Media'),('Baja');

INSERT INTO pastel.perfil (nom_per) VALUES ('usuario del sistema');

INSERT INTO pastel.rol (nom_rol) VALUES 
('Administrador'),('Repartidor'),('Cajero'),('Cliente');

INSERT INTO pastel.perfil_roles (perfiles_id_per,roles_id_rol) VALUES 
(1,1),(1,2),(1,4);

INSERT INTO pastel.direccion 
(aven_dir,calle_dir,ref_dir,urb_dir,id_dis) VALUES 
('av. los girasoles','call falsa','al costado del colegio cesar vallejo',NULL,1);


INSERT INTO pastel.usuario (ape_usu,nac_usu,ema_usu,nom_usu,pass_usu,tel_usu,id_dir,id_est,id_per,id_rol,id_sex) VALUES 
('Mendoza','1998-12-09','abrmendoza32@gmail.com','Abraham','1234',924659960,1,1,1,1,1);

INSERT INTO pastel.mensaje (men_mens) VALUES 
('Fallo validacion'),('Usuario encontrado')
,('Usuario creado'),('Usuario actualizado')
,('Producto no encontrado'),('Pedido registrado')
,('Compra registrado'),('Correo ya existe')
,('Producto agregado a la cesta'),('Email actualizado')
,('Telefono actualizado'),('Constraseña actualizada')
,('Contraseña incorrecta');

INSERT INTO pastel.error (cam_err,men_err,id_mens) VALUES 
('Email','Email de usuario no encontrado',1),
('Pasword','Contrase�a de usuario no encontrado',1);

INSERT INTO pastel.producto_detalle (tip_prod_det) VALUES 
('Empanada'),('Pan'),('Torta'),('Postre')
,('Keke'),('Galleta');


INSERT INTO pastel.producto (des_prod,nom_prod,prec_prod,stoc_prod,id_prod_det,id_est) VALUES 
('Relleno de carne ','Carne',3.5,20,1,7)
,('Jamón inglés, quesos fundidos y salsa blanca','Mixta',4,10,1,7)
,('Pechuga de pollo, espinaca, poro, salsa blanca y mejorana','Pollo',3.2,21,1,7)
,('Quesos fundidos y salsa blanca','Queso',2.5,5,1,7)
;

INSERT INTO pastel.imagen (cla_img,nom_img,src_img,id_prod) VALUES 
(NULL,NULL,'https://i.imgur.com/c7CvSIi.jpg',1)
,(NULL,NULL,'https://i.imgur.com/qkNbN2O.jpg',2)
,(NULL,NULL,'https://i.imgur.com/eZsHbht.jpg',3)
,(NULL,NULL,'https://i.imgur.com/qAGx7Is.jpg',4)
;

INSERT INTO pastel.pedido (cod_ped,envi_ped,fec_ped,id_est,id_ped_pri,id_usu) VALUES 
('8sgeg89','2019-12-09 15:20:06','2019-12-10 10:00:00',3,3,1)
,('2o3gig3','2019-12-08 20:15:00','2019-12-10 22:30:00',3,3,1);


INSERT INTO pastel.compra (cant_comp,fech_comp,mont_comp,id_ped,id_prod) VALUES 
(1,'2019-12-09 14:20:06',NULL,1,1);