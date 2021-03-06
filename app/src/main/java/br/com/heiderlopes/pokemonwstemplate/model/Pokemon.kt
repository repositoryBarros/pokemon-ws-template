package br.com.heiderlopes.pokemonwstemplate.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pokemon(
    @SerializedName("number") val numero: String,
    @SerializedName("name") val nome: String,
    @SerializedName("imageURL") val urlImagem: String,
    @SerializedName("ps") var ps: Int,
    @SerializedName("attack") var ataque: Int,
    @SerializedName("defense") var defesa: Int,
    @SerializedName("velocity") var velocidade: Int
) : Parcelable
