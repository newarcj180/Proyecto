-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.45-community-nt-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema tiendita
--

CREATE DATABASE IF NOT EXISTS tiendita;
USE tiendita;

--
-- Temporary table structure for view `verempleado`
--
DROP TABLE IF EXISTS `verempleado`;
DROP VIEW IF EXISTS `verempleado`;

--
-- Temporary table structure for view `vistaproducto`
--
DROP TABLE IF EXISTS `vistaproducto`;
DROP VIEW IF EXISTS `vistaproducto`;
CREATE TABLE `vistaproducto` (
  `IDproducto` char(4),
  `ARTEFACTO` varchar(16),
  `MARCA` varchar(20),
  `MODELO` varchar(10),
  `CANTIDAD` int(3)
);

--
-- Definition of table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
CREATE TABLE `categoria` (
  `CODIGO` char(4) collate utf8_unicode_ci NOT NULL,
  `ARTEFACTO` varchar(16) collate utf8_unicode_ci NOT NULL,
  PRIMARY KEY  (`CODIGO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `categoria`
--

/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` (`CODIGO`,`ARTEFACTO`) VALUES 
 ('c01','televisor'),
 ('c02','radio'),
 ('c03','dvd'),
 ('c04','equipo de sonido'),
 ('c05','lavadora'),
 ('c06','cocina a gas'),
 ('c07','cocina electrica'),
 ('c08','licuadora'),
 ('c09','licuoextractor'),
 ('c10','extractor'),
 ('c11','olla arrocera'),
 ('c14','microondas'),
 ('c15','refrigeradora'),
 ('c16','mp3');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;


--
-- Definition of table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE `cliente` (
  `CODIGO` varchar(2) collate utf8_unicode_ci NOT NULL,
  `NOMBRE` varchar(15) collate utf8_unicode_ci NOT NULL,
  `APELLIDOS` varchar(25) collate utf8_unicode_ci NOT NULL,
  `RAZOSO` varchar(20) collate utf8_unicode_ci NOT NULL,
  `DIRECCION` varchar(30) collate utf8_unicode_ci NOT NULL,
  `TELEFONO` varchar(10) collate utf8_unicode_ci NOT NULL,
  `RUC` varchar(11) collate utf8_unicode_ci NOT NULL,
  PRIMARY KEY  (`CODIGO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `cliente`
--

/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`CODIGO`,`NOMBRE`,`APELLIDOS`,`RAZOSO`,`DIRECCION`,`TELEFONO`,`RUC`) VALUES 
 ('01','sayda','gonzales','S.A.A','PARDO987','369852','78965412302'),
 ('02','Rodesa','Ramirez','','jr.lima123','944722010','20316070735'),
 ('03','Rosa ','Altura Perez','','jr.hualcan 234','','10102030402'),
 ('04','Marasca','Caballero','','av.Anchoveta e-7 ','311010','20556677889'),
 ('05','Julio','Espinosa Hidal','','j.r callao 579','943111213',''),
 ('06','melvin','minaya Torres','','El progreso','456325','10452328156'),
 ('07','Daniel','Flores ','Ronald SAC','2 de mayo','462878','10458236489'),
 ('08','jhony','Zavaleta','','Manuel Ruiz','325645','10789563178'),
 ('09','Anita','Dominguez','cencitec','miraflores bajo','328612','10124658723'),
 ('10','hilary','Perez','floreria roys','Espinar N-20','423625','10658947145');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;


--
-- Definition of table `detalle_venta`
--

DROP TABLE IF EXISTS `detalle_venta`;
CREATE TABLE `detalle_venta` (
  `VENTA` char(4) collate utf8_unicode_ci NOT NULL,
  `PRODUCTO` char(4) collate utf8_unicode_ci NOT NULL,
  `CANTIDAD` int(3) NOT NULL,
  `PRECIO` decimal(6,2) NOT NULL,
  PRIMARY KEY  (`VENTA`,`PRODUCTO`),
  KEY `PRODUCTO` (`PRODUCTO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `detalle_venta`
--

/*!40000 ALTER TABLE `detalle_venta` DISABLE KEYS */;
INSERT INTO `detalle_venta` (`VENTA`,`PRODUCTO`,`CANTIDAD`,`PRECIO`) VALUES 
 ('v01','p001',2,'200.00'),
 ('v02','p002',4,'250.00'),
 ('v03','p003',3,'500.00'),
 ('v04','p004',2,'1000.00'),
 ('v01','p005',1,'100.00'),
 ('v05','p006',1,'1000.00'),
 ('v05','p007',2,'600.00'),
 ('v05','p008',1,'300.00'),
 ('v06','p002',3,'1000.00'),
 ('v07','p003',4,'250.00'),
 ('v08','p004',3,'300.00'),
 ('v08','p005',1,'600.00'),
 ('v09','p012',1,'800.00'),
 ('v10','p014',1,'500.00'),
 ('v11','p013',2,'100.00'),
 ('v11','p010',2,'250.00'),
 ('v12','p015',2,'300.00'),
 ('v12','p009',1,'400.00'),
 ('v12','p003',2,'500.00'),
 ('v12','p014',1,'100.00');
/*!40000 ALTER TABLE `detalle_venta` ENABLE KEYS */;


--
-- Definition of table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
CREATE TABLE `empleado` (
  `codigo` varchar(3) collate utf8_unicode_ci NOT NULL,
  `apellidos` varchar(25) collate utf8_unicode_ci NOT NULL,
  `nombres` varchar(20) collate utf8_unicode_ci NOT NULL,
  `fecnac` date NOT NULL,
  `telefono` varchar(10) collate utf8_unicode_ci NOT NULL,
  `direccion` varchar(20) collate utf8_unicode_ci NOT NULL,
  `sueldo` int(11) NOT NULL,
  PRIMARY KEY  (`codigo`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `empleado`
--

/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` (`codigo`,`apellidos`,`nombres`,`fecnac`,`telefono`,`direccion`,`sueldo`) VALUES 
 ('e01','De la Cruz','ana','2000-10-05','323281','pardo',10),
 ('e02','sanchez sarmiento','elizabeth','1992-07-27','320300','mirafores',1200),
 ('e03','vasquez lozano','hada patricica','1990-09-12','','san pedro',1000),
 ('e04','moreno marrufo','giancarlo','1986-09-03','324747','Sa Borja',2000),
 ('e05','lopez agusto','tommy','1991-03-26','','Santa Cruz',900),
 ('e06','garcia  eusebio','orlando','1988-09-14','319463','Miramar',1300),
 ('e07','angulo milla','diana','1991-04-13','353213','Florida',2000),
 ('e08','anglas sifuentes','andres','1990-07-19','943494746','Bellamar',1800),
 ('e09','chero acosta','cristian','1988-02-10','777851','San Luis',1200),
 ('e10','mogollon yumbato','josmell','1990-03-30','762176','2 de Mayo',1500),
 ('e11','flores bulnes','josue','1990-08-22','943018033','Olaya',1000),
 ('e12','zapata fuentes','angel','1988-12-19','990727494','Casma',1500),
 ('e13','Olazabal Juarez','jenny','1991-01-16','978001895','miraflores',20),
 ('e14','rivera','daiel','2010-02-12','pardi','12364',12364),
 ('e15','palacios','julio','1986-12-03','pardo','13469',13469);
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;


--
-- Definition of table `marca`
--

DROP TABLE IF EXISTS `marca`;
CREATE TABLE `marca` (
  `CODIGO` char(4) collate utf8_unicode_ci NOT NULL,
  `MARCA` varchar(20) collate utf8_unicode_ci NOT NULL,
  PRIMARY KEY  (`CODIGO`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `marca`
--

/*!40000 ALTER TABLE `marca` DISABLE KEYS */;
INSERT INTO `marca` (`CODIGO`,`MARCA`) VALUES 
 ('m01','lg'),
 ('m02','samsung'),
 ('m03','panasonic'),
 ('m04','pionner'),
 ('m05','sony'),
 ('m06','akita'),
 ('m07','toshiba'),
 ('m08','acer'),
 ('m09','kenwood'),
 ('m10','mabe'),
 ('m11','daewoo');
/*!40000 ALTER TABLE `marca` ENABLE KEYS */;


--
-- Definition of table `producto`
--

DROP TABLE IF EXISTS `producto`;
CREATE TABLE `producto` (
  `IDproducto` char(4) collate utf8_unicode_ci NOT NULL,
  `CATEGORIA` char(3) collate utf8_unicode_ci NOT NULL,
  `MARCA` char(3) collate utf8_unicode_ci NOT NULL,
  `MODELO` varchar(10) collate utf8_unicode_ci NOT NULL,
  `CANTIDAD` int(3) NOT NULL,
  PRIMARY KEY  (`IDproducto`),
  KEY `CATEGORIA` (`CATEGORIA`),
  KEY `MARCA` (`MARCA`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `producto`
--

/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` (`IDproducto`,`CATEGORIA`,`MARCA`,`MODELO`,`CANTIDAD`) VALUES 
 ('p007','c02','m04','ty-14',20),
 ('p009','c03','m02','rt-145',18),
 ('p010','c04','m03','ru-145',18),
 ('p001','c01','m01','lx-80',50),
 ('p002','c02','m02','rx-100',20),
 ('p003','c03','m03','ty-89',30),
 ('p004','c04','m04','r-450',10),
 ('p005','c05','m05','er-784',5),
 ('p006','c01','m02','r-78',20),
 ('p008','c05','m01','er-478',25),
 ('p011','c10','m06','lm-56',10),
 ('p012','c11','m07','xf-10',15),
 ('p013','c12','m08','rt-14',10),
 ('p014','c13','m09','wf-500',20);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;


--
-- Definition of table `venta`
--

DROP TABLE IF EXISTS `venta`;
CREATE TABLE `venta` (
  `IDventa` char(4) collate utf8_unicode_ci NOT NULL,
  `CLIENTE` varchar(2) collate utf8_unicode_ci NOT NULL,
  `FECHA` date NOT NULL,
  `TOTAL` decimal(6,0) NOT NULL,
  `empleado` varchar(3) collate utf8_unicode_ci NOT NULL,
  PRIMARY KEY  (`IDventa`),
  KEY `empleado` (`empleado`),
  KEY `CLIENTE` (`CLIENTE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `venta`
--

/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
INSERT INTO `venta` (`IDventa`,`CLIENTE`,`FECHA`,`TOTAL`,`empleado`) VALUES 
 ('v01','01','2010-10-15','500','e01'),
 ('v02','02','2010-10-16','1000','e02'),
 ('v03','03','2010-10-17','1500','e03'),
 ('v04','04','2010-10-18','2000','e04'),
 ('v05','05','2010-10-19','2500','e01'),
 ('v06','01','2010-10-20','3000','e06'),
 ('v07','00','2010-11-10','1000','e02'),
 ('v08','02','2010-11-10','1500','e08'),
 ('v09','03','2010-11-12','800','e01'),
 ('v10','03','2010-12-12','500','e10'),
 ('v11','04','2010-11-15','700','e02'),
 ('v12','5','2010-11-11','2100','e01');
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;


--
-- Definition of table `vercategoria`
--

DROP TABLE IF EXISTS `vercategoria`;
CREATE TABLE `vercategoria` (
  `CODIGO` char(4) default NULL,
  `ARTEFACTO` varchar(16) default NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `vercategoria`
--

/*!40000 ALTER TABLE `vercategoria` DISABLE KEYS */;
/*!40000 ALTER TABLE `vercategoria` ENABLE KEYS */;


--
-- Definition of table `vermarca`
--

DROP TABLE IF EXISTS `vermarca`;
CREATE TABLE `vermarca` (
  `CODIGO` char(4) default NULL,
  `MARCA` varchar(20) default NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `vermarca`
--

/*!40000 ALTER TABLE `vermarca` DISABLE KEYS */;
/*!40000 ALTER TABLE `vermarca` ENABLE KEYS */;


--
-- Definition of procedure `sp_eliminaCliente`
--

DROP PROCEDURE IF EXISTS `sp_eliminaCliente`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_eliminaCliente`(cod varchar(2))
delete from cliente
where CODIGO=cod $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_eliminaProducto`
--

DROP PROCEDURE IF EXISTS `sp_eliminaProducto`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_eliminaProducto`(idp char(4))
delete from producto
where IDproducto=idp $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_eliminaVenta`
--

DROP PROCEDURE IF EXISTS `sp_eliminaVenta`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_eliminaVenta`(idv char(4))
delete from venta
where IDventa=idv $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_grabaCategoria`
--

DROP PROCEDURE IF EXISTS `sp_grabaCategoria`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_CREATE_USER' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_grabaCategoria`(cod char(3),cate varchar(16))
BEGIN


insert into categoria
values(cod,cate);
END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_grabaCliente`
--

DROP PROCEDURE IF EXISTS `sp_grabaCliente`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_grabaCliente`(nom varchar(15),ap varchar(25),rs varchar(20),
dir varchar(30),tl varchar(10),ruc varchar(11))
BEGIN
declare numero integer;
select count(CODIGO) into numero
from cliente;
insert into cliente(CODIGO,NOMBRE,APELLIDOS,RAZOSO,DIRECCION,TELEFONO,RUC)
values(concat(numero+1),nom,ap,rs,dir,tl,ruc);
END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_grabaEmpleado`
--

DROP PROCEDURE IF EXISTS `sp_grabaEmpleado`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_grabaEmpleado`(ap varchar (25), nom varchar(20), f date, 
tel varchar(10), dir varchar(20), su int(11))
BEGIN
declare numero integer; 
select count(codigo) into numero 
from empleado; 

insert into empleado(codigo,apellidos,nombres,fecnac,telefono,direccion,sueldo) 
values(concat("e",(numero+1)),ap,nom,f,tel,dir,su); 

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_grabaMarca`
--

DROP PROCEDURE IF EXISTS `sp_grabaMarca`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_grabaMarca`(cod char(4),marc varchar(20))
insert into marca
values(cod,marc) $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_grabaProducto`
--

DROP PROCEDURE IF EXISTS `sp_grabaProducto`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_grabaProducto`(cat char(3),mar char(3),mode varchar(10),cant int(3))
BEGIN
declare numero integer;
select count(IDproducto) into numero
from producto;

insert into producto(IDproducto,CATEGORIA,MARCA,MODELO,CANTIDAD)
values(concat("p",(numero+1)),cat,mar,mode,cant);
END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_modificaCategoria`
--

DROP PROCEDURE IF EXISTS `sp_modificaCategoria`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificaCategoria`(cod char(4), art varchar(16))
update categoria set ARTEFACTO=art
where CODIGO=cod $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_modificaCliente`
--

DROP PROCEDURE IF EXISTS `sp_modificaCliente`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificaCliente`(cod varchar(2),nom varchar(15),ap varchar(25),rs varchar(20),dir varchar(30),tl varchar(10),ruc varchar(11))
update cliente set NOMBRE=nom,APELLIDOS=ap, RAZOSO=rs, DIRECCION=dir, TELEFONO=tl,RUC=ruc
where CODIGO=cod $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_modificaEmpleado`
--

DROP PROCEDURE IF EXISTS `sp_modificaEmpleado`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificaEmpleado`(cod varchar(3),ap varchar(25),nom varchar(20),
fec date,tel varchar(10),dir varchar(20),suel int(11))
BEGIN
update empleado set apellidos=ap, nombres=nom, fecnac=fec, telefono=tel, direccion=dir,sueldo=suel
where codigo=cod;
END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_modificaMarca`
--

DROP PROCEDURE IF EXISTS `sp_modificaMarca`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificaMarca`(cod char(4),mar varchar(20))
update marca set MARCA=mar
where CODIGO=cod $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_modificarProducto`
--

DROP PROCEDURE IF EXISTS `sp_modificarProducto`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_CREATE_USER' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificarProducto`(idp char(4),cat char(3), marc char(3),model varchar(10),cant int)
update producto set MODELO=model, CANTIDAD=cant
where IDproducto=idp and CATEGORIA=cat and MARCA=marc $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `VerCategoria`
--

DROP PROCEDURE IF EXISTS `VerCategoria`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `VerCategoria`()
BEGIN
select ARTEFACTO from categoria;
END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `VerCliente`
--

DROP PROCEDURE IF EXISTS `VerCliente`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `VerCliente`()
select NOMBRE from cliente $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `VerEmpleado`
--

DROP PROCEDURE IF EXISTS `VerEmpleado`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `VerEmpleado`()
BEGIN
select apellidos from empleado;
END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `VerMarca`
--

DROP PROCEDURE IF EXISTS `VerMarca`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `VerMarca`()
BEGIN
select MARCA from marca;
END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of view `verempleado`
--

DROP TABLE IF EXISTS `verempleado`;
DROP VIEW IF EXISTS `verempleado`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `verempleado` AS select `empleado`.`apellidos` AS `apellidos` from `empleado`;

--
-- Definition of view `vistaproducto`
--

DROP TABLE IF EXISTS `vistaproducto`;
DROP VIEW IF EXISTS `vistaproducto`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vistaproducto` AS select `producto`.`IDproducto` AS `IDproducto`,`categoria`.`ARTEFACTO` AS `ARTEFACTO`,`marca`.`MARCA` AS `MARCA`,`producto`.`MODELO` AS `MODELO`,`producto`.`CANTIDAD` AS `CANTIDAD` from ((`producto` join `categoria`) join `marca`) where ((`producto`.`CATEGORIA` = `categoria`.`CODIGO`) and (`producto`.`MARCA` = `marca`.`CODIGO`));



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
