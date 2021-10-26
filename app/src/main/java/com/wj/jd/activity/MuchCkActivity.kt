package com.wj.jd.activity

import android.text.TextUtils
import android.widget.Toast
import com.wj.jd.BaseActivity
import com.wj.jd.R
import com.wj.jd.util.CacheUtil
import com.wj.jd.util.UpdateTask
import kotlinx.android.synthetic.main.activity_much.*

class MuchCkActivity : BaseActivity() {

    override fun setLayoutId(): Int {
        return R.layout.activity_much
    }

    override fun initView() {
        setTitle("多账号设置")
    }

    override fun initData() {
        inputCK1.setText(CacheUtil.getString("ck1"))
        inputCK2.setText(CacheUtil.getString("ck2"))
    }

    override fun setEvent() {
        updateCK1.setOnClickListener {
            if (TextUtils.isEmpty(inputCK1.text.toString())) {
                Toast.makeText(this, "CK为空，添加失败", Toast.LENGTH_SHORT).show()
            } else {
                CacheUtil.putString("ck1", inputCK1.text.toString())
                Toast.makeText(this, "CK2添加成功", Toast.LENGTH_SHORT).show()
                UpdateTask.widgetUpdateDataUtil1.updateWidget("ck1")
            }
        }

        updateCK2.setOnClickListener {
            if (TextUtils.isEmpty(inputCK2.text.toString())) {
                Toast.makeText(this, "CK为空，添加失败", Toast.LENGTH_SHORT).show()
            } else {
                CacheUtil.putString("ck2", inputCK2.text.toString())
                Toast.makeText(this, "CK3添加成功", Toast.LENGTH_SHORT).show()
                UpdateTask.widgetUpdateDataUtil2.updateWidget("ck2")
            }
        }
    }
}