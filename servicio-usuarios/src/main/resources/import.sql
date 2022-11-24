 INSERT INTO roles(nombre) VALUES ('USER');
INSERT INTO roles(nombre) VALUES ('ADMIN');


INSERT INTO usuarios(username, passwords, enableds, nombre, apellido, email) VALUES ('user', '$2a$10$7ai6FuBx6JCVtoxAOuMQBuDaOai.hDASVVXFs.mj1g91IEgrrIzkm', 1, 'Pedro', 'Perez', 'pperez@gmail.com');
INSERT INTO usuarios(username, passwords, enableds, nombre, apellido, email) VALUES ('admin', '$2a$10$W870r7tO0mPSqoaRjEqPz.kNfhWB2sXXdQgBDxpodwwvfrrhOn2NG', 1, 'Laura', 'Garces', 'lgarces@gmail.com');
INSERT INTO usuarios(username, passwords, enableds, nombre, apellido, email) VALUES ('user1', '$2a$10$yCXeJvnLC08BdwHnGxdEVOoWiK5BuYxL0YMhwDgVKUVS3r.L7KGAO', 1, 'Felipe', 'Corredor', 'fcorredor@gmail.com');
INSERT INTO usuarios(username, passwords, enableds, nombre, apellido, email) VALUES ('user2', '$2a$10$rhl2u58bOlKskI2XxW7vIex4di1VW92bJtaVq5UeenLekgWw61pDi', 1, 'Camilo', 'Urrego', 'currego@gmail.com');
INSERT INTO usuarios(username, passwords, enableds, nombre, apellido, email) VALUES ('user3', '$2a$10$TLZcHvACouwuOFJU4Car1ey1CxnTKyliDYgQq4dBngYmhfmL7yF2e', 1, 'Liliana', 'Mont', 'lmont@gmail.com');
INSERT INTO usuarios(username, passwords, enableds, nombre, apellido, email) VALUES ('user4', '$2a$10$Vv0ZRsnZOYpIkrAdZ4cfC..UrDZO3oq7SvWt2ZOkFjja4DHjq5T.G', 1, 'Paula', 'Corredor', 'pcorredor1@gmail.com');
INSERT INTO usuarios(username, passwords, enableds, nombre, apellido, email) VALUES ('user5', '$2a$10$rSgcVe2AmOcdsh64UoOWO.ZtzGlKGHBTa/puo3jgmfaBpGV8/rgC2', 1, 'Carlos', 'Castaño', 'ccastaño@gmail.com');
INSERT INTO usuarios(username, passwords, enableds, nombre, apellido, email) VALUES ('user6', '$2a$10$Mr7QpurMCWcP9/pP5Ru6n.o.8P1jmJIzC3wea.gkdDVgXtvWFCHNi', 1, 'Camila', 'Buitrago', 'cbuitrago@gmail.com');


INSERT INTO usuario_roles(usuario_id, role_id) VALUES(1,1);
INSERT INTO usuario_roles(usuario_id, role_id) VALUES(2,2);
INSERT INTO usuario_roles(usuario_id, role_id) VALUES(2,1);
INSERT INTO usuario_roles(usuario_id, role_id) VALUES(3,1);
INSERT INTO usuario_roles(usuario_id, role_id) VALUES(4,1);
INSERT INTO usuario_roles(usuario_id, role_id) VALUES(5,1);
INSERT INTO usuario_roles(usuario_id, role_id) VALUES(6,1);
INSERT INTO usuario_roles(usuario_id, role_id) VALUES(7,1);
INSERT INTO usuario_roles(usuario_id, role_id) VALUES(8,1);
INSERT INTO usuario_roles(usuario_id, role_id) VALUES(9,1);


