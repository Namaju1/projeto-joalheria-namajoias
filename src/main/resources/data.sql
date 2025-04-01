INSERT IGNORE INTO tb_tipousuario (id_tipo_usuario, nome) VALUES 
(1, 'Adimin'),
(2, 'Cliente'),
(3, 'Vendedor'),
(4, 'Gerente');

INSERT IGNORE INTO tb_categoriaproduto (id_categoria_usuario, nome, descricao) VALUES
(1, 'Anéis', 'Acesório para os dedos'),
(2, 'Colares', 'Acesório para o pescoço'),
(3, 'Brincos', 'Acesório para as orelhas'),
(4, 'Pulseiras', 'Acessorio para os braços'),
(5, 'Relógios', 'Acesório para não atrasar no SENAI');

-- Inserindo Tipos (se não existirem)
INSERT IGNORE INTO tb_tipoproduto (id_tipo_produto, nome, descricao) VALUES
(1, 'Ouro', '18k'),
(2, 'Prata', '750'),
(3, 'Bijuteria', 'É biju mas é de rico');