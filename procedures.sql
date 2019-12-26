use pastel; 

DELIMITER //
 
create procedure registrarCliente(
	in email varchar(320),
	in passwd varchar(12))
begin
    insert into pastel.usuario(
    	usuario.ema_usu,
    	usuario.pass_usu,
    	usuario.id_rol,
    	usuario.id_per,
    	usuario.id_est) 
   	values(email,passwd,4,1,1) ;
end //

create procedure ActualizarCliente(
	in nombre varchar(20),
	in apellido varchar(30),
	in edad smallint,
	in telefono int,
	in sex int,
	in idusuario bigint)
begin
    update pastel.usuario set 
    	usuario.nom_usu = nombre,
    	usuario.ape_usu = apellido,
    	usuario.eda_usu = edad,
    	usuario.tel_usu = telefono,
    	usuario.id_sex  = sex
   	where usuario.id_usu = idusuario ;
end //

create procedure RegistrarDireccion(
	in avenida varchar(50),
	in calle varchar(50),
	in postal int,
	in departamento varchar(50),
	in lote varchar(10),
	in manzana varchar(10),
	in referencia varchar(200),
	in sector varchar(50),
	in urbanizacion varchar(100),
	in iddireccion bigint,
	in iddistrito bigint)
begin
	insert into pastel.direccion (
		direccion.aven_dire,
		direccion.calle_dir,
		direccion.cod_pos_dir,
		direccion.dep_dir,
		direccion.lot_dir,
		direccion.manz_dir,
		direccion.ref_dir,
		direccion.sect_dir,
		direccion.urb_dir,
		direccion.id_dir,
		direccion.id_dis)
	values (
		avenida,calle,
		postal,departamento,
		lote,manzana,
		referencia,sector,
		urbanizacion,iddireccion,iddistrito) ;
end //

create procedure ActualizarClienteDireccion(
	in iddireccion bigint,
	in idusario bigint)
begin
    update pastel.usuario set 
    	usuario.id_dir = iddireccion
   	where usuario.id_usu = idusuario ;
end //


create procedure RegistarCompra(
	in cantidad int,
	in codigo varchar(15),
	in fecha datetime,
	in monto double,
	in idProducto bigint)
begin
    insert into pastel.compra(
    	compra.cant_comp,
    	compra.cod_comp,
    	compra.fech_comp,
    	compra.mont_comp,
    	compra.id_prod) 
   	values(cantidad,codigo,fecha,monto,idproducto) ;
end //

create procedure RegistarPedido(
	in codigo varchar(15),
	in envio datetime,
	in fecha datetime,
	in idEstado bigint,
	in idPrioridad bigint,
	in idUsuario bigint)
begin
    insert into pastel.pedido(
    	pedido.cod_ped,
    	pedido.envi_ped,
    	pedido.fec_ped,
    	pedido.id_est,
    	pedido.id_ped_pri,
    	pedido.id_usu) 
   	values(codigo,envio,fecha,idEstado,idPrioridad,idUsuario) ;
end //

create procedure AsignarPedidoACompra(
	in idPedido bigint,
	in idCompra bigint)
begin
    update pastel.compra set 
    	compra.id_ped = idPedido
   	where compra.id_comp = idCompra ;
end //

create procedure RegistrarCesta(
	in fecha datetime,
	in idUsuario bigint)
begin
    insert into pastel.cesta(
    	cesta.fech_cest,
    	cesta.id_usu) 
   	values(fecha,idUsuario) ;
end //

create procedure RegistrarCestaProd(
	in cantidad int,
	in idCesta bigint,
	in idProducto bigint,
	in idEstado bigint)
begin
    insert into pastel.cesta_productos(
    	cesta_productos.cant_cest_prod,
    	cesta_productos.id_cest,
    	cesta_productos.id_prod,
    	cesta_productos.id_est)
   	values(cantidad,idCesta,idProducto,idEstado) ;
end //




