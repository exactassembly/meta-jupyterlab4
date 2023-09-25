
SUMMARY = "Python bindings to Rust's persistent data structures (rpds)"
HOMEPAGE = "https://github.com/crate-py/rpds"
AUTHOR = "Julian Berman <Julian+rpds@GrayVines.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0806f4503f5044424eb6569434521db9"

SRC_URI[sha256sum] = "3620464fe3fee23dd1bf7b68546b0120bec4713fd99e5f63829d8bcc13336376"
SRC_URI += "file://0001_fix_module_hierarchy.patch"
FILESEXTRAPATHS:prepend := "${THISDIR}/python3-rpdy-py:"

PYPI_PACKAGE = "rpds_py"

require ${BPN}-crates.inc

inherit pypi cargo-update-recipe-crates python_maturin

# maturin/pyo3 does not create the correct filename for the python module to be found
# and loaded by the python3 interpreter
do_install:append() {
    ln -s rpds.cpython-311-armv7l-linux-gnueabihf.so  ${D}/usr/lib/python3.11/site-packages/rpds/__init__.cpython-311-arm-linux-gnueabihf.so
}
INSANE_SKIP:${PN}="dev-so"
RDEPENDS:${PN} = "\
"