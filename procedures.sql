use pastel; 

DELIMITER //
 
create procedure CrearClienteBasico(
	in nombre varchar(20),
	in apellido varchar(30),
	in email varchar(320),
	in passwd varchar(12))
begin
    insert into pastel.usuario(
    	usuario.nom_usu,
    	usuario.ape_usu,
    	usuario.ema_usu,
    	usuario.pass_usu,
    	usuario.id_rol,
    	usuario.id_per,
    	usuario.id_est) 
   	values(nombre,apellido,email,passwd,4,1,1) ;
end //

create procedure ActualizarCliente(
	in nombre varchar(20),
	in apellido varchar(30),
	in edad smallint,
	in telefono int,
	in idusuario bigint)
begin
    update pastel.usuario set 
    	usuario.nom_usu = nombre,
    	usuario.ape_usu = apellido,
    	usuario.eda_usu = edad,
    	usuario.tel_usu = telefono
   	where usuario.id_usu = idusuario ;
end //

create procedure CrearDireccion(
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




