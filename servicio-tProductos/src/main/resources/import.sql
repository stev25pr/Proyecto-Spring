INSERT INTO envio (estado,direccion_recibido,direccion_entrega) VALUES ('Destino','Calle falsa 123','Calle falsa 1234');
INSERT INTO envio (estado,direccion_recibido,direccion_entrega) VALUES ('En camino','Calle falsa 1234','Calle falsa 12345');
INSERT INTO envio (estado,direccion_recibido,direccion_entrega) VALUES ('En envio','Calle falsa 12345','Calle falsa 123456');

INSERT INTO t_producto (id_envio,nombre,descripcion,peso,volumen,valor) VALUES(1,'Arroz','descripcion1',20,30,50);
INSERT INTO t_producto (id_envio,nombre,descripcion,peso,volumen,valor) VALUES(1,'Zapatos','descripcion2',2,1000,10002);
INSERT INTO t_producto (id_envio,nombre,descripcion,peso,volumen,valor) VALUES(1,'Elefante','descripcion3',3,788,791);
INSERT INTO t_producto (id_envio,nombre,descripcion,peso,volumen,valor) VALUES(2,'harina sospechosa','descripcion4',4,12,16);