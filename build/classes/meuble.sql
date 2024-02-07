/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  hasina / miaro
 * Created: 12 déc. 2023
 */
create database meuble;

create table matiere_premiere(
    id_matiere_premiere serial primary key,
    designation varchar(50),
    prix_unitaire double precision
);
create table style_meuble(
    id_style_meuble serial primary key,
    designation varchar(50)
);
create table categorie_meuble(
    id_categorie_meuble serial primary key,
    designation varchar(50)
);
create table style_matiere_premiere(
    id_style_matiere_premiere serial primary key,
    id_matiere_premiere int references matiere_premiere(id_matiere_premiere),
    id_style_meuble int references style_meuble(id_style_meuble)
);
create table taille(
    id_taille serial primary key,
    designation varchar(50)
);
create table composition(
    id_composition serial primary key,
    id_style_matiere_premiere int references style_matiere_premiere(id_style_matiere_premiere),
    id_categorie int references categorie_meuble(id_categorie_meuble),
    id_taille int references taille(id_taille),
    quantite double precision
);
create table poste(
    id_poste serial primary key,
    salaire double precision
);
create table ouvrier(
    id_ouvrier serial primary key,
    nom_ouvrier varchar(50),
    id_poste int references poste(id_poste),
    date_embauche date
);
create table temps_confection(
    id_temps_confection serial primary key,
    temps_confection time,
    id_style int references style_meuble(id_style_meuble),
    id_categorie int references categorie_meuble(id_categorie_meuble)
);
create table ouvrier_meuble(
    id_ouvrier_meuble serial primary key,
    id_ouvrier int references ouvrier(id_ouvrier),
    id_style int references style_meuble(id_style_meuble),
    id_categorie int references categorie_meuble(id_categorie_meuble)
);
create or replace view v_meuble_matiere_premiere as
SELECT c.id_composition, s.id_style_meuble, s.id_matiere_premiere, c.id_categorie, c.quantite, c.id_taille, m.prix_unitaire
FROM style_matiere_premiere s
JOIN composition c on s.id_style_matiere_premiere = c.id_style_matiere_premiere
JOIN matiere_premiere m on m.id_matiere_premiere = s.id_matiere_premiere;

create or replace view v_meuble_prix_confection as
select id_categorie, id_taille, id_style_meuble,sum(prix_unitaire * quantite) from v_meuble_matiere_premiere group by id_style_meuble,id_categorie, id_taille;

    select v.id_categorie, v.id_style_meuble, p.salaire
    from v_meuble_prix_confection v
    join ouvrier_meuble o on o.id_style = v.id_style_meuble
    join ouvrier_meuble om on om.id_categorie = v.id_categorie
    join ouvrier ou on ou.id_ouvrier = o.id_ouvrier
    join poste p on p.id_poste = ou.id_poste
    join temps_confection t on t.id_style = v.id_style_meuble
    join temps_confection tc on tc.id_categorie = v.id_categorie
    group by v.id_categorie, v.id_style_meuble, p.salaire;

insert into ouvrier_meuble values (default,1, 1, 1);
insert into ouvrier_meuble values (default,2, 1, 1);

create or replace view v_ouvrier_poste as
    SELECT id_ouvrier, p.salaire, (current_date - date_embauche)/365 anciennete
    FROM ouvrier o
    JOIN poste p on o.id_poste = p.id_poste;

create table Promotion(
    id_promotion serial primary key,
    debut integer,
    fin integer,
    valeur integer,
    designation varchar(255)
);
create table genre(
    id_genre serial primary key,
    nom_genre varchar(50)
);
create table client(
    id_client serial primary key,
    nom_client varchar(255),
    id_genre int references genre(id_genre)
);
create table meuble(
    id_meuble serial primary key,
    id_style int references style_meuble(id_style_meuble),
    id_categorie int references categorie_meuble(id_categorie_meuble),
    prix double precision
);
create table vente(
    id_vente serial primary key,
    id_client int references client(id_client),
    id_meuble int references meuble(id_meuble),
    date_vente date,
    id_taille int references taille(id_taille)
);
insert into promotion values (default, 0, 2, 1, 'junior');
insert into promotion values (default, 2, 5, 2, 'senior');
insert into promotion values (default, 5, 100, 3, 'expert');

insert into meuble values(default, 1, 1, 500000);

create or replace view v_vente_genre_pourcentage as
SELECT count(c.id_client) as nombre, c.id_genre, m.id_meuble
FROM vente v
JOIN meuble m on v.id_meuble = m.id_meuble
JOIN client c on v.id_client = c.id_client
GROUP BY c.id_genre, m.id_meuble;

create table entree(
    id_entree serial primary key,
    id_meuble_param int references meuble_param(id_meuble_param),
    qte double precision,
    date_entree date
);
create table sortie(
    id_sortie serial primary key,
    id_meuble_param int references meuble_param(id_meuble_param),
    qte double precision,
    date_sortie date
);
create table meuble_param(
    id_meuble_param serial primary key,
    id_meuble int references meuble(id_meuble),
    id_taille int references taille(id_taille)
);