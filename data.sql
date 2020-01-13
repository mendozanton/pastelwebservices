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

INSERT INTO pastel.perfil (des_per,nom_per) VALUES 
('Desarrollo de modulos','Desarrollador')
,('Tiene acceso a las configuraciones del sistema','Administrador')
,('Persona que solicita el servicio','Cliente')
;

INSERT INTO pastel.grupo (id_gru,nom_gru) VALUES 
(1,'Mantenedores')
,(2,'Catelyn publico')
,(3,'Reportes')
,(4,'Gestiones')
,(5,'Provicional')
,(7,'Utilidades')
;

INSERT INTO pastel.menu (id_men,nom_men,rut_men,id_est,id_gru) VALUES 
(1,'Mantenimiento de Menus','mntMenu',1,1)
,(2,'Mantenimiento de Perfiles','mntPerfil',1,1)
,(3,'Mantenimiento de Roles','mntRol',1,1)
,(4,'Mantenimiento de Usuarios','mntUsuario',1,1)
,(8,'Mi Perfil','miPerfil',1,7)
,(13,'Mis Solicitudes','mntSolicitud',1,4)
,(19,'Cambiar Contraseña','cambiaContrasena',2,7)
,(20,'Mis Favoritos','miFavorito',2,7)
,(21,'Solicitar Presupuesto','solicitaPresupuesto',1,4)
,(22,'Atencion de Solicitudes','mntAtencionSolicitud',1,4)
;


INSERT INTO pastel.rol (des_rol,nom_rol) VALUES 
('Tiene acceso total al sistema','Desarrollador de Sistema')
,('Persona que usara el servicio','Usuario de Servicio')
,('Tiene acceso la configuracion del sistema','Administrador')
;

INSERT INTO pastel.perfil_roles (perfiles_id_per,roles_id_rol) VALUES 
(1,1)
,(1,2)
;

INSERT INTO pastel.direccion (aven_dir,calle_dir,ref_dir,urb_dir,id_dis) VALUES 
('av. los girasoles','call falsa','al costado del colegio cesar vallejo','',1)
,('av los postes','','mz d lt 25 cerca al mercado las flores','',1)
,('','andres falcon','sector 5 pasaje 6 ','',2)
,('av las palmas','','lote 2','',2)
,('','','a dos cuadras del mall','claveles',1)
;

INSERT INTO pastel.usuario (ape_usu,ema_usu,nac_usu,nom_usu,pass_usu,tel_usu,id_dir,id_est,id_per,id_rol,id_sex) VALUES 
('Mendoza','abrmendoza32@gmail.com','1998-12-09 00:00:00.0','Abraham','123',924659960,1,1,1,1,2)
;

INSERT INTO pastel.mensaje (men_mens) VALUES 
('Fallo validacion'),('Usuario encontrado')
,('Usuario creado'),('Usuario actualizado')
,('Producto no encontrado'),('Pedido registrado')
,('Compra registrado'),('Correo ya existe')
,('Producto agregado a la cesta'),('Email actualizado')
,('Telefono actualizado'),('Constraseña actualizada')
,('Contraseña incorrecta');

INSERT INTO pastel.error (cam_err,men_err,id_mens) VALUES 
('Email','Email de usuario no encontrado',1)
,('Pasword','Clave de usuario no encontrado',1)
;

INSERT INTO pastel.producto_detalle (tip_prod_det) VALUES 
('Empanada'),('Pan'),('Torta'),('Postre')
,('Keke'),('Galleta');


INSERT INTO pastel.producto (des_prod,nom_prod,prec_prod,stoc_prod,id_prod_det,id_est) VALUES 
('Relleno de carne ','Carne',3.5,20,1,7)
,('Jamón inglés, quesos fundidos y salsa blanca','Mixta',4,10,1,7)
,('Pechuga de pollo, espinaca, poro, salsa blanca y mejorana','Pollo',3.2,21,1,7)
,('Quesos fundidos y salsa blanca','Queso',2.5,5,1,7)
;

INSERT INTO pastel.producto (des_prod,des2_prod,nom_prod,prec_prod,stoc_prod,id_prod_det,id_est) VALUES 
(NULL,NULL,'Delivery',4,NULL,NULL,2)
;

INSERT INTO pastel.imagen (nom_img,src_img,id_prod) VALUES 
(NULL,'https://i.imgur.com/c7CvSIi.jpg',1)
,(NULL,'https://i.imgur.com/qkNbN2O.jpg',2)
,(NULL,'https://i.imgur.com/eZsHbht.jpg',3)
,(NULL,'https://i.imgur.com/qAGx7Is.jpg',4)
;

INSERT INTO pastel.cesta (fech_cest,id_usu) VALUES 
('2020-01-02 15:28:42.0',1)
;
