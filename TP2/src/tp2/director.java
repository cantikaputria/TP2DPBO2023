/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author cacan
 */

public class director
{
    private int id_director;
    private String img;
    private String nama;
    private String jumlah_film;

    public director(int id_director, String img, String nama, String jumlah_film)
    {
        this.id_director = id_director;
        this.img = img;
        this.nama = nama;
        this.jumlah_film = jumlah_film;
    }

    public int getId_director()
    {
        return id_director;
    }

    public void setId_director(int id_director)
    {
        this.id_director = id_director;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img)
    {
        this.img = img;
    }

    public String getNama()
    {
        return nama;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getJumlah_film()
    {
        return jumlah_film;
    }

    public void setJumlah_film(String jumlah_film)
    {
        this.jumlah_film = jumlah_film;
    }
}

