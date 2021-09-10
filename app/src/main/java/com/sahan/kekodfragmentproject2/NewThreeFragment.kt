package com.sahan.kekodfragmentproject2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class NewThreeFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_three, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.setOnClickListener{

            val fragmentTransaction = parentFragmentManager.beginTransaction()//.addToBackStack("asddas")

            val newThreeFragment = NewThreeFragment.newInstance("asdasd", "asadadas")
            fragmentTransaction.add(R.id.fragmentDetail, newThreeFragment).commit()
            for (fragment in parentFragmentManager.fragments) {
                parentFragmentManager.beginTransaction().remove(fragment!!).commit()
            }
        }
    }

    companion object {


        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            NewThreeFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}