package com.sahan.kekodfragmentproject2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment



class NewOneFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        view.setOnClickListener{

            val fragmentTransaction = parentFragmentManager.beginTransaction()

            val newOneFragment = NewOneFragment.newInstance("asdasd", "asadadas")
            fragmentTransaction.add(R.id.fragmentDetail, newOneFragment).commit()
            for (fragment in parentFragmentManager.fragments) {

                parentFragmentManager.beginTransaction().remove(fragment!!).commit()

            }

        }
    }




    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            NewOneFragment().apply {
                arguments = Bundle().apply {

                }

            }

    }


}