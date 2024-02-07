-- Insertion composition for categorie lit type royale
INSERT INTO composition values(default,1 ,1, 1,2);
INSERT INTO composition values(default, 2, 1, 1,10);

-- Insertion composition for categorie canape type royale (meuble 2)
insert into composition values(default,1, 2, 1, 1);
insert into composition values(default, 2, 2, 1, 5);

-- Temps confection pour meuble 2
insert into temps_confection values(default, '02:30:00', 2);

-- Ouvrier_meuble pour meuble 2
insert into ouvrier_meuble values (default, 3, 2);
insert into ouvrier_meuble values (default, 12, 2);
