SUMMARY = "PyZMQ: Python bindings for ZMQ"
DESCRIPTION = "This package contains Python bindings for ZeroMQ. ZMQ is a lightweight and fast messaging implementation."
HOMEPAGE = "http://zeromq.org/bindings:python"
LICENSE = "BSD-3-Clause & LGPL-3.0-only"
LIC_FILES_CHKSUM = "\
    file://LICENSE.BSD;md5=1787206f198344195a671b60326c59dc \
    file://LICENSE.LESSER;md5=0e99bfbdd8b9d33b0221986fe3be89ed \
"

DEPENDS = "\
    ${PYTHON_PN}-setuptools-scm-native \
    ${PYTHON_PN}-packaging-native \
    ${PYTHON_PN}-cython-native \
    zeromq \
"

SRC_URI:append = " \
    file://club-rpath-out.patch \
"
SRC_URI[sha256sum] = "259c22485b71abacdfa8bf79720cd7bcf4b9d128b30ea554f01ae71fdbfdaa23"

inherit pypi pkgconfig python_setuptools_build_meta ptest

RDEPENDS:${PN} += "\
        ${PYTHON_PN}-json \
        ${PYTHON_PN}-multiprocessing \
"

do_compile:prepend() {
    echo [global] > ${S}/setup.cfg
    echo zmq_prefix = ${STAGING_DIR_HOST} >> ${S}/setup.cfg
    echo have_sys_un_h = True >> ${S}/setup.cfg
    echo skip_check_zmq = True >> ${S}/setup.cfg
    echo libzmq_extension = False >> ${S}/setup.cfg
    echo no_libzmq_extension = True >> ${S}/setup.cfg
}

do_install:append() {
        sed -i -e 's#${RECIPE_SYSROOT}##g' ${D}${PYTHON_SITEPACKAGES_DIR}/zmq/utils/config.json
        sed -i -e 's#${RECIPE_SYSROOT}##g' ${D}${PYTHON_SITEPACKAGES_DIR}/zmq/utils/compiler.json
}

BBCLASSEXTEND = "native nativesdk"